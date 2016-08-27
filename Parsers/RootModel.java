import java.util.ArrayList;

class RootModel {

	public String logo;
	public String topic;
	public String description;
	public String end_time;
	public Call_for_papersModel _call_for_papers;
	public String email;
	public CreatorModel _creator;
	public String privacy;
	public String type;
	public String location_name;
	public int id;
	public String code_of_conduct;
	public String start_time;
	public String state;
	public String timezone;
	public String name;
	public CopyrightModel _copyright;
	public String organizer_description;
	public String organizer_name;
	public String background_image;
	public ArrayList<Social_linksModel> social_links;
	public VersionModel _version;
	public String schedule_published_on;

	public RootModel(String logo, String topic, String description, String end_time, Call_for_papersModel call_for_papers, String email, CreatorModel creator, String privacy, String type, String location_name, int id, String code_of_conduct, String start_time, String state, String timezone, String name, CopyrightModel copyright, String organizer_description, String organizer_name, String background_image, ArrayList<Social_linksModel> social_links, VersionModel version, String schedule_published_on) {

		this.logo = logo;
		this.topic = topic;
		this.description = description;
		this.end_time = end_time;
		this._call_for_papers = call_for_papers;
		this.email = email;
		this._creator = creator;
		this.privacy = privacy;
		this.type = type;
		this.location_name = location_name;
		this.id = id;
		this.code_of_conduct = code_of_conduct;
		this.start_time = start_time;
		this.state = state;
		this.timezone = timezone;
		this.name = name;
		this._copyright = copyright;
		this.organizer_description = organizer_description;
		this.organizer_name = organizer_name;
		this.background_image = background_image;
		this.social_links = social_links;
		this._version = version;
		this.schedule_published_on = schedule_published_on;

	}

}