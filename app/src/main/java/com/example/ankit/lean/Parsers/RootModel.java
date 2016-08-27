import java.util.ArrayList;

class RootModel {

	public String description;
	public String organizer_description;
	public String schedule_published_on;
	public Call_for_papersModel _call_for_papers;
	public String location_name;
	public VersionModel _version;
	public String state;
	public CopyrightModel _copyright;
	public String end_time;
	public String email;
	public String privacy;
	public String organizer_name;
	public String type;
	public String background_image;
	public String timezone;
	public String name;
	public ArrayList<Social_linksModel> social_links;
	public String code_of_conduct;
	public String start_time;
	public String logo;
	public int id;
	public CreatorModel _creator;
	public String topic;

	public RootModel(String description, String organizer_description, String schedule_published_on, Call_for_papersModel call_for_papers, String location_name, VersionModel version, String state, CopyrightModel copyright, String end_time, String email, String privacy, String organizer_name, String type, String background_image, String timezone, String name, ArrayList<Social_linksModel> social_links, String code_of_conduct, String start_time, String logo, int id, CreatorModel creator, String topic) {

		this.description = description;
		this.organizer_description = organizer_description;
		this.schedule_published_on = schedule_published_on;
		this._call_for_papers = call_for_papers;
		this.location_name = location_name;
		this._version = version;
		this.state = state;
		this._copyright = copyright;
		this.end_time = end_time;
		this.email = email;
		this.privacy = privacy;
		this.organizer_name = organizer_name;
		this.type = type;
		this.background_image = background_image;
		this.timezone = timezone;
		this.name = name;
		this.social_links = social_links;
		this.code_of_conduct = code_of_conduct;
		this.start_time = start_time;
		this.logo = logo;
		this.id = id;
		this._creator = creator;
		this.topic = topic;

	}

}