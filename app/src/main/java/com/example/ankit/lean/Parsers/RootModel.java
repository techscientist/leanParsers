import java.util.ArrayList;

class RootModel {

	public int id;
	public String privacy;
	public String location_name;
	public String description;
	public CopyrightModel _copyright;
	public String organizer_name;
	public CreatorModel _creator;
	public VersionModel _version;
	public String timezone;
	public ArrayList<Social_linksModel> social_links;
	public String logo;
	public String state;
	public String topic;
	public String code_of_conduct;
	public String name;
	public String background_image;
	public String type;
	public String start_time;
	public String end_time;
	public String email;
	public Call_for_papersModel _call_for_papers;
	public String organizer_description;
	public String schedule_published_on;

	public RootModel(int id, String privacy, String location_name, String description, CopyrightModel copyright, String organizer_name, CreatorModel creator, VersionModel version, String timezone, ArrayList<Social_linksModel> social_links, String logo, String state, String topic, String code_of_conduct, String name, String background_image, String type, String start_time, String end_time, String email, Call_for_papersModel call_for_papers, String organizer_description, String schedule_published_on) {

		this.id = id;
		this.privacy = privacy;
		this.location_name = location_name;
		this.description = description;
		this._copyright = copyright;
		this.organizer_name = organizer_name;
		this._creator = creator;
		this._version = version;
		this.timezone = timezone;
		this.social_links = social_links;
		this.logo = logo;
		this.state = state;
		this.topic = topic;
		this.code_of_conduct = code_of_conduct;
		this.name = name;
		this.background_image = background_image;
		this.type = type;
		this.start_time = start_time;
		this.end_time = end_time;
		this.email = email;
		this._call_for_papers = call_for_papers;
		this.organizer_description = organizer_description;
		this.schedule_published_on = schedule_published_on;

	}

}