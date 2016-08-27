import java.util.ArrayList;

class RootModel {

	public String code_of_conduct;
	public String organizer_name;
	public String organizer_description;
	public String email;
	public String state;
	public String logo;
	public int id;
	public String type;
	public CopyrightModel _copyright;
	public String schedule_published_on;
	public String timezone;
	public Call_for_papersModel _call_for_papers;
	public String start_time;
	public String end_time;
	public CreatorModel _creator;
	public String description;
	public VersionModel _version;
	public String background_image;
	public String location_name;
	public String topic;
	public String privacy;
	public String name;
	public ArrayList<Social_linksModel> social_links;

	public RootModel(String code_of_conduct, String organizer_name, String organizer_description, String email, String state, String logo, int id, String type, CopyrightModel copyright, String schedule_published_on, String timezone, Call_for_papersModel call_for_papers, String start_time, String end_time, CreatorModel creator, String description, VersionModel version, String background_image, String location_name, String topic, String privacy, String name, ArrayList<Social_linksModel> social_links) {

		this.code_of_conduct = code_of_conduct;
		this.organizer_name = organizer_name;
		this.organizer_description = organizer_description;
		this.email = email;
		this.state = state;
		this.logo = logo;
		this.id = id;
		this.type = type;
		this._copyright = copyright;
		this.schedule_published_on = schedule_published_on;
		this.timezone = timezone;
		this._call_for_papers = call_for_papers;
		this.start_time = start_time;
		this.end_time = end_time;
		this._creator = creator;
		this.description = description;
		this._version = version;
		this.background_image = background_image;
		this.location_name = location_name;
		this.topic = topic;
		this.privacy = privacy;
		this.name = name;
		this.social_links = social_links;

	}

}