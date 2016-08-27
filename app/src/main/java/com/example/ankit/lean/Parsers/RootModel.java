import java.util.ArrayList;

class RootModel {

	public int id;
	public String logo;
	public CopyrightModel _copyright;
	public String organizer_name;
	public String start_time;
	public Call_for_papersModel _call_for_papers;
	public String email;
	public String name;
	public String end_time;
	public String description;
	public ArrayList<Social_linksModel> social_links;
	public String state;
	public String timezone;
	public String background_image;
	public String type;
	public String topic;
	public String organizer_description;
	public String privacy;
	public String code_of_conduct;
	public VersionModel _version;
	public CreatorModel _creator;
	public String location_name;
	public String schedule_published_on;

	public RootModel(int id, String logo, CopyrightModel copyright, String organizer_name, String start_time, Call_for_papersModel call_for_papers, String email, String name, String end_time, String description, ArrayList<Social_linksModel> social_links, String state, String timezone, String background_image, String type, String topic, String organizer_description, String privacy, String code_of_conduct, VersionModel version, CreatorModel creator, String location_name, String schedule_published_on) {

		this.id = id;
		this.logo = logo;
		this._copyright = copyright;
		this.organizer_name = organizer_name;
		this.start_time = start_time;
		this._call_for_papers = call_for_papers;
		this.email = email;
		this.name = name;
		this.end_time = end_time;
		this.description = description;
		this.social_links = social_links;
		this.state = state;
		this.timezone = timezone;
		this.background_image = background_image;
		this.type = type;
		this.topic = topic;
		this.organizer_description = organizer_description;
		this.privacy = privacy;
		this.code_of_conduct = code_of_conduct;
		this._version = version;
		this._creator = creator;
		this.location_name = location_name;
		this.schedule_published_on = schedule_published_on;

	}

}