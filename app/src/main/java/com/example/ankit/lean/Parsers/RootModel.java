import java.util.ArrayList;

class RootModel {

	public String location_name;
	public String email;
	public CreatorModel _creator;
	public String type;
	public String code_of_conduct;
	public int id;
	public String privacy;
	public String state;
	public String organizer_name;
	public String topic;
	public String schedule_published_on;
	public VersionModel _version;
	public String timezone;
	public String description;
	public Call_for_papersModel _call_for_papers;
	public String name;
	public String start_time;
	public ArrayList<Social_linksModel> social_links;
	public String organizer_description;
	public String end_time;
	public String background_image;
	public CopyrightModel _copyright;
	public String logo;

	public RootModel(String location_name, String email, CreatorModel creator, String type, String code_of_conduct, int id, String privacy, String state, String organizer_name, String topic, String schedule_published_on, VersionModel version, String timezone, String description, Call_for_papersModel call_for_papers, String name, String start_time, ArrayList<Social_linksModel> social_links, String organizer_description, String end_time, String background_image, CopyrightModel copyright, String logo) {

		this.location_name = location_name;
		this.email = email;
		this._creator = creator;
		this.type = type;
		this.code_of_conduct = code_of_conduct;
		this.id = id;
		this.privacy = privacy;
		this.state = state;
		this.organizer_name = organizer_name;
		this.topic = topic;
		this.schedule_published_on = schedule_published_on;
		this._version = version;
		this.timezone = timezone;
		this.description = description;
		this._call_for_papers = call_for_papers;
		this.name = name;
		this.start_time = start_time;
		this.social_links = social_links;
		this.organizer_description = organizer_description;
		this.end_time = end_time;
		this.background_image = background_image;
		this._copyright = copyright;
		this.logo = logo;

	}

}